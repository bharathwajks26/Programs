from collections import Counter

reviews = [
    "The product is amazing! I love it.",
    "Not satisfied with the quality.",
    "This is the best purchase I've made.",
    "The customer service was terrible.",
    "I would recommend this product to others."
]

all_text = ' '.join(reviews)

words = all_text.lower().split()

word = Counter(words)

print("Word Frequency Distribution:")
for word, frequency in word.items():
    print(f"{word}: {frequency}")



'''
sample output 
Word Frequency Distribution:
the: 4  product: 2
is: 2 amazing!: 1
i: 2    love: 1
it.: 1  not: 1
satisfied: 1 with: 1
quality.: 1 this: 2
best: 1 purchase: 1
i've: 1 made.: 1
customer: 1 service: 1
was: 1  terrible.: 1
would: 1    recommend: 1
to: 1   others.: 1
'''