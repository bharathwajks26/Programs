import pandas as pd
import matplotlib.pyplot as plt

# Sample data
data = {
    'Name': ['Lionel Messi', 'Cristiano Ronaldo', 'Neymar Jr', 'Kylian Mbappé', 'Robert Lewandowski',
             'Luka Modric', 'Sergio Ramos'],
    'Age': [34, 36, 29, 22, 33, 35, 35],
    'Position': ['Forward', 'Forward', 'Forward', 'Midfielder', 'Forward', 'Midfielder', 'Defender'],
    'Goals': [45, 40, 30, 35, 38, 12, 5],
    'Salary': [1000000, 900000, 800000, 750000, 700000, 500000, 400000]
}

data = pd.DataFrame(data)

average_age = data['Age'].mean()
above_average_age_players = data[data['Age'] > average_age]['Name']

position_counts = data['Position'].value_counts()
plt.bar(position_counts.index, position_counts.values)
plt.xlabel('Position')
plt.ylabel('Number of Players')
plt.title('Distribution of Players Based on Positions')
plt.xticks(rotation=45)
plt.show()

print("Top 5 Goal Scorers:")
print(data.nlargest(5, 'Goals'))
print("\nTop 5 Highest Salaries:")
print(data.nlargest(5, 'Salary'))
print(f"\nAverage Age of Players: {average_age:.2f}")
print("\nPlayers Above Average Age:")
print(above_average_age_players)


'''
sample output 
Top 5 Goal Scorers:
                 Name  Age    Position  Goals   Salary
0        Lionel Messi   34     Forward     45  1000000
1   Cristiano Ronaldo   36     Forward     40   900000
4  Robert Lewandowski   33     Forward     38   700000
3       Kylian Mbappé   22  Midfielder     35   750000
2           Neymar Jr   29     Forward     30   800000

Top 5 Highest Salaries:
                 Name  Age    Position  Goals   Salary
0        Lionel Messi   34     Forward     45  1000000
1   Cristiano Ronaldo   36     Forward     40   900000
2           Neymar Jr   29     Forward     30   800000
3       Kylian Mbappé   22  Midfielder     35   750000
4  Robert Lewandowski   33     Forward     38   700000

Average Age of Players: 32.00

Players Above Average Age:
0          Lionel Messi
1     Cristiano Ronaldo
4    Robert Lewandowski
5           Luka Modric
6          Sergio Ramos
Name: Name, dtype: object
'''