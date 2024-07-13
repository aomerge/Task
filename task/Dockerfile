FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /task

# Copy all files to the container
COPY . .

# Ensure gradlew is executable
RUN chmod +x gradlew

# Download the dependencies and build the project
RUN ./gradlew build --no-daemon

# Expose the port on which the application will run
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["./gradlew"]
CMD ["run"]

