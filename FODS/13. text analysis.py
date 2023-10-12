from collections import Counter

text = """
This is a sample text. It contains some words , and some words are repeated. 
The goal is to calculate the frequency distribution of words in this text.
"""

text = text.lower()

words = text.split()

freq = Counter(words)

print("Word Frequency Distribution:")
for word, frequency in freq.items():
    print(f"{word}: {frequency}")


'''
sample output 
Word Frequency Distribution:
this: 2 is: 2
a: 1    sample: 1
text.: 2    it: 1
contains: 1 some: 2
words: 3    ,: 1
and: 1  are: 1
repeated.: 1    the: 2
goal: 1 to: 1
calculate: 1    frequency: 1
distribution: 1 of: 1
in: 1
'''