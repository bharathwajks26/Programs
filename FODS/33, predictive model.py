import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt

# Manually create input data as simple arrays
engine_size = np.array([1.5, 1.7, 1.8, 2.0, 1.6, 1.9, 1.7, 1.8, 1.6, 1.9, 1.8, 2.0, 1.5, 1.7, 1.6, 1.9, 1.8, 1.7, 1.6, 1.9,
                        1.7, 1.8, 2.0, 1.6, 1.9, 1.8, 1.7, 1.6, 1.9, 1.8, 2.0, 1.5, 1.7, 1.6, 1.9, 1.8, 1.7, 1.6, 1.9, 1.8, 1.7])
horsepower = np.array([150, 180, 200, 250, 160, 210, 175, 190, 155, 200, 185, 260, 140, 170, 150, 220, 190, 175, 160, 215,
                       180, 195, 240, 165, 205, 190, 175, 160, 210, 185, 265, 130, 160, 145, 205, 190, 180, 155, 210, 185, 170])
car_price = np.array([40000, 45000, 50000, 55000, 42000, 52000, 46000, 49000, 43000, 53000, 48000, 57000, 39000, 44000, 41000,
                     54000, 49000, 46000, 43000, 52000, 45000, 48000, 56000, 42000, 51000, 49000, 46000, 43000, 53000, 47000,
                     58000, 38000, 42000, 40000, 51000, 48000, 45000, 42000, 53000, 47000, 44000])

data = pd.DataFrame({
    'EngineSize': engine_size,
    'Horsepower': horsepower,
    'Price': car_price
})

features = ['EngineSize', 'Horsepower']
target = 'Price'
X = data[features]
y = data[target]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

model = LinearRegression()
model.fit(X_train, y_train)

y_pred = model.predict(X_test)

accuracy = model.score(X_test, y_test)
print(f"Model Accuracy: {accuracy:.2f}")
plt.scatter(y_test, y_pred)
plt.xlabel('Actual Price')
plt.ylabel('Predicted Price')
plt.title('Actual vs. Predicted Car Prices')
plt.show()



'''
sample output 
Model Accuracy: 0.44
'''