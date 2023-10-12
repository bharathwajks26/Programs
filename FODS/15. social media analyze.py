import pandas as pd

data = {'post_id': [1, 2, 3, 4, 5, 6, ],
        'likes': [100, 150, 50, 50, 120,150]}

df = pd.DataFrame(data)
freq= df['likes'].value_counts()
print("Likes Frequency Distribution:")
print(freq)


'''
sample output 
Likes Frequency Distribution:
likes
50     2
100    1
120    1
150    2
Name: count, dtype: int64
'''