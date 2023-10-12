import pandas as pd
import scipy.stats as stats

data = {'rating': [4, 5, 3, 4, 5, 4, 3, 5, 4, 4, 5, 3, 4, 5, 4, 4, 3, 4, 5, 3]}
df = pd.DataFrame(data)
ratings = df['rating']
mean = ratings.mean()
std = ratings.std()
size = len(ratings)
con_lvl = 0.95

# Calculate the t-score for the desired confidence level
t_score = stats.t.ppf((1 + con_lvl) / 2, df=size - 1)

# Calculate standard error of the mean (SEM)
sem = std / (size ** 0.5)

# Calculate the margin of error
mof = t_score * sem

# Calculate the confidence interval
con_interval = (mean - mof, mean + mof)
print(f"Sample Mean Rating: {mean:.2f}")
print(f"Confidence Interval ({con_lvl*100:.0f}%): "
      f"({con_interval[0]:.2f}, {con_interval[1]:.2f})")

'''sample output 
Sample Mean Rating: 4.05
Confidence Interval (95%): (3.69, 4.41)
'''