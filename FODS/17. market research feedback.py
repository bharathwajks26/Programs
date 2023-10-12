import pandas as pd
import string
from collections import Counter
import nltk
from nltk.corpus import stopwords
import matplotlib.pyplot as plt

nltk.download('stopwords')
stop_words = set(stopwords.words('english'))

df = pd.read_csv("C:/Users/bhara/Downloads/studies/work/New folder/FODS/17. market research feedback.csv")

def preprocess_text(text):
    text = text.lower()
    text = text.translate(str.maketrans('', '', string.punctuation))
    words = text.split()
    words = [word for word in words if word not in stop_words]
    return words

all_words = df['feedback'].apply(preprocess_text).explode()

word_frequency = all_words.value_counts()

top_n = int(input("Enter the value of N for top N most frequent words: "))

print(f"Top {top_n} Most Frequent Words:")
print(word_frequency.head(top_n))

word_frequency.head(top_n).plot(kind='bar', figsize=(10, 6))
plt.title(f"Top {top_n} Most Frequent Words")
plt.xlabel("Words")
plt.ylabel("Frequency")
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()


'''
sample output 
Top 3 Most Frequent Words:
feedback
product         1
expectations    1
customer        1
'''