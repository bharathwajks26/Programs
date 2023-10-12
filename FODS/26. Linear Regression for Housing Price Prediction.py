import numpy as np
from sklearn.linear_model import LinearRegression

# Sample dataset (features: area, bedrooms; target: price)
X = np.array([[1400, 3], [1600, 4], [1800, 3], [2000, 4], [2200, 5]])
y = np.array([200000, 250000, 280000, 300000, 330000])

# Create a Linear Regression model
lin_reg = LinearRegression()

# Fit the model on the dataset
lin_reg.fit(X, y)

# Input features for the new house
area = float(input("Enter area: "))
bedrooms = int(input("Enter no of bedrooms: "))

features = np.array([[area, bedrooms]])

# Predict the price of the new house
predict_price = lin_reg.predict(features)

print(f"The predicted price of the new house is: {predict_price[0]:,.2f}")


'''
sample output 
Enter area: 200
Enter no of bedrooms: 1
The predicted price of the new house is: 23,333.33
'''
