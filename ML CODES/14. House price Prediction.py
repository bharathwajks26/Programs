import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# Sample house dataset (for demonstration purposes)
# You should replace this with a more extensive and relevant dataset
house_features = np.array([[1500, 3, 20], [2000, 4, 15], [1200, 2, 25]])
house_prices = np.array([200000, 300000, 150000])

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(house_features, house_prices, test_size=0.2, random_state=42)

# Initialize and train the Linear Regression model
linear_regression_model = LinearRegression()
linear_regression_model.fit(X_train, y_train)

# Make predictions on the test set
y_pred = linear_regression_model.predict(X_test)

# Display mean squared error (for simplicity, not accuracy)
mse = mean_squared_error(y_test, y_pred)
print(f"Mean Squared Error: {mse:.2f}")

# Example: Predict the price for a new house
new_house_features = np.array([[1800, 3, 18]])
predicted_price = linear_regression_model.predict(new_house_features)
print(f"Predicted Price for the New House: ${predicted_price[0]:,.2f}")
