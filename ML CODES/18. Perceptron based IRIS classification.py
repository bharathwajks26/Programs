from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.linear_model import Perceptron
from sklearn.metrics import accuracy_score

# Load the iris dataset
X, y = load_iris(return_X_y=True)

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Initialize and train the Perceptron classifier
perceptron_classifier = Perceptron()
perceptron_classifier.fit(X_train, y_train)

# Make predictions on the test set
y_pred = perceptron_classifier.predict(X_test)

# Display accuracy (for simplicity, not accuracy)
accuracy = accuracy_score(y_test, y_pred)*100
print(f"Accuracy: {accuracy:.2f}")
