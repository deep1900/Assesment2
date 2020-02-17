RUN BOTH APPLICATION AS JAVA APPLICATION.
OPEN POST MAN.
http://localhost:8080/customer/creditCheck IS THE URL FOR THE POST REQUEST.
PAYLOAD/REQUESTBODY:
{
	"id":4,
	"firstName":"Komal",
	
	"lastName":"Mankadia",
	
	"ssn":123434556,
	
	"creditCardNo":1234567059381284
		

}

IN DATABASE CREATE EXECUTE INSERT STATEMENT USING BELOW SCHEMA FOR CREDIT CHECK TABLE
INSERT INTO `credit_db`.`CreditCheck`
(`Id`,
`SSN`,
`status`)
VALUES
(<{Id: }>,
<{SSN: }>,
<{status: }>);
SELECT * FROM credit_db.CreditCheck;
AND FOR THE CUSTOMER TABLE:
INSERT INTO `credit_db`.`customer`
(`id`,
`CreditCardNo`,
`FirstName`,
`LastName`,
`SSN`)
VALUES
(<{id: }>,
<{CreditCardNo: }>,
<{FirstName: }>,
<{LastName: }>,
<{SSN: }>);

