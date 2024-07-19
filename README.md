# Spring Boot Render Example

Investigate and demonstrate how to deploy a Spring Boot REST api on Render.

## How To Use

```bash	
# Clone the repository
git clone git@github.com:chrberndt/spring-boot-render-example.git

# Change working directory
cd spring-boot-render-example

# Build and run the application
./gradlew bootRun

# Stop the development server with
Ctrl + C
```

The example endpoint can then be accessed at `http://localhost:8080/api/v1/users`

## Configure Render Deployment

Render by default will (re)deploy the application whenever a commit is pushed to the main branch of the repository.

See: https://docs.render.com/deploys

The example endpoint is available at `https://spring-boot-render-example.onrender.com/api/v1/users`
(Please note: since this demo runs on Render's free tier, the first response might take some time.)
