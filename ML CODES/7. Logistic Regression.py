from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score
import numpy as np

# Load the iris dataset
X, y = load_iris(return_X_y=True)

# Add some random noise to labels
np.random.seed(42)
y_noisy = (y + np.random.choice([1, -1], size=len(y), p=[0.1, 0.9])) % 3

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y_noisy, test_size=0.2, random_state=42)

# Initialize and train the Logistic Regression model with increased max_iter
logistic_regression_model = LogisticRegression(max_iter=1000).fit(X_train, y_train)

# Make predictions on the test set
y_pred = logistic_regression_model.predict(X_test)

# Display accuracy
print(f"Accuracy: {accuracy_score(y_test, y_pred) * 100:.2f}%")
