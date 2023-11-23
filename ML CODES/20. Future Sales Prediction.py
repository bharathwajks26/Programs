from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
import numpy as np

# Sample future sales dataset (for demonstration purposes)
# You should replace this with a more extensive and relevant dataset
sales_features = np.array([[1], [2], [3], [4], [5]])
sales_targets = np.array([100, 150, 200, 250, 300])  # Sales for each corresponding feature

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(sales_features, sales_targets, test_size=0.2, random_state=42)

# Initialize and train the Linear Regression model
linear_regression_model = LinearRegression()
linear_regression_model.fit(X_train, y_train)

# Make predictions on the test set
y_pred = linear_regression_model.predict(X_test)

# Display predicted future sales
print("Predicted Future Sales:")
for i, pred in enumerate(y_pred):
    print(f"Feature: {X_test[i][0]}, Predicted Sales: {pred:.2f}")
