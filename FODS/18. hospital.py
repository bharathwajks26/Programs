import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import scipy.stats as stats

# Sample data
data = {'age': [32, 45, 23, 52, 26, 48, 34, 29, 41, 36, 28, 50, 31, 40, 33, 47, 25, 38],
        'fat': [22.4, 34.2, 18.5, 30.3, 25.9, 31.4, 27.2, 26.7, 29.9, 30.5, 28.5, 32.4, 25.1, 29.7, 23.7, 29.5, 25.8, 27.5]}

df = pd.DataFrame(data)

age_mean, age_median, age_std = df['age'].mean(), df['age'].median(), df['age'].std()
fat_mean, fat_median, fat_std = df['fat'].mean(), df['fat'].median(), df['fat'].std()

print("Age:")
print(f"Mean: {age_mean:.2f}, Median: {age_median:.2f}, Std Dev: {age_std:.2f}")
print("\nfat:")
print(f"Mean: {fat_mean:.2f}, Median: {fat_median:.2f}, Std Dev: {fat_std:.2f}")

plt.figure(figsize=(10, 6))
sns.boxplot(data=df)
plt.title('Boxplots for Age and fat')
plt.show()

plt.figure(figsize=(10, 6))
sns.scatterplot(data=df, x='age', y='fat')
plt.title('Scatter Plot: Age vs. fat')
plt.show()

plt.figure(figsize=(10, 6))
stats.probplot(df['fat'], dist='norm', plot=plt)
plt.title('Q-Q Plot: fat')
plt.show()


'''
sample output 

'''