#!/bin/bash

# Script to add @author udayhegde to Java files that don't have it

# List of files that need the author annotation
files=(
    "src/main/java/com/example/solid_demo/solid/dip/better/test/UserServiceTest.java"
    "src/main/java/com/example/solid_demo/solid/dip/better/config/AppConfig.java"
    "src/main/java/com/example/solid_demo/solid/dip/better/service/impl/SlackNotificationService.java"
    "src/main/java/com/example/solid_demo/solid/dip/better/service/impl/EmailNotificationService.java"
    "src/main/java/com/example/solid_demo/solid/dip/better/service/impl/UserServiceImpl.java"
    "src/main/java/com/example/solid_demo/solid/dip/better/service/NotificationService.java"
    "src/main/java/com/example/solid_demo/solid/lsp/better/service/impl/ShapeCalculatorServiceImpl.java"
    "src/main/java/com/example/solid_demo/solid/lsp/better/service/impl/GenericDataService.java"
    "src/main/java/com/example/solid_demo/solid/isp/bad/WorkerOperations.java"
    "src/main/java/com/example/solid_demo/solid/isp/bad/HumanWorker.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/impl/RobotWorker.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/impl/WorkManager.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/impl/SeniorDeveloper.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/impl/JuniorDeveloper.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/DocumentationWriter.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/MeetingAttendee.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/Sleeper.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/Programmer.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/Worker.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/Deployer.java"
    "src/main/java/com/example/solid_demo/solid/isp/better/Eater.java"
    "src/main/java/com/example/solid_demo/solid/ocp/better/payment/impl/PayPalPayment.java"
    "src/main/java/com/example/solid_demo/solid/ocp/better/payment/impl/CryptocurrencyPayment.java"
    "src/main/java/com/example/solid_demo/solid/ocp/better/payment/impl/BankTransferPayment.java"
    "src/main/java/com/example/solid_demo/solid/ocp/better/payment/impl/CreditCardPayment.java"
    "src/main/java/com/example/solid_demo/solid/ocp/better/payment/PaymentMethod.java"
)

for file in "${files[@]}"; do
    echo "Processing $file"
    if [ -f "$file" ]; then
        # Check if file already has @author udayhegde
        if ! grep -q "@author udayhegde" "$file"; then
            # Find the package line and add author after it
            sed -i '' '/^package /a\
\
/**\
 * @author udayhegde\
 */
' "$file"
            echo "Added @author to $file"
        else
            echo "$file already has @author"
        fi
    else
        echo "File $file not found"
    fi
done

echo "Script completed!"
