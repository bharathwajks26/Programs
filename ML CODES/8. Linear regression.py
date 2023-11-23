from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import accuracy_score
import numpy as np

# Load the iris dataset
X, y = load_iris(return_X_y=True)

# Convert the problem into a binary classification task
y_binary = (y == 0).astype(int)  # 1 if class 0 (setosa), 0 otherwise

# Introduce more random noise to target values
np.random.seed(42)
y_noisy = y_binary + np.random.normal(scale=0.4, size=len(y_binary))

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, (y_noisy >= 0.5).astype(int), test_size=0.2, random_state=42)

# Initialize and train the Linear Regression model
linear_regression_model = LinearRegression().fit(X_train, y_train)

# Make predictions on the test set
y_pred = linear_regression_model.predict(X_test)
y_pred_binary = (y_pred >= 0.5).astype(int)  # Convert predicted probabilities to binary

# Display accuracy
accuracy = accuracy_score(y_test, y_pred_binary) * 100
print(f"Accuracy: {accuracy:.2f}%")
