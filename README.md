# Halcyon
Halcyon Utilities, Thin supplementary utilities to Apache Commons Utilities

These utilities are NOT meant to be used in the attempt to avoid performing null checks and catching exceptions.

--
The API is subject to change before first release version!
--

## Use Case
LDAP Directory String (https://tools.ietf.org/html/rfc4517#section-3.3.6)[syntax] defines that there must one or more characters in the attribute. In order to use LDAP library that does not treat empty strings
as non existing attributes in the directory these utilities help to get null when the stored value does not exist anymore. This reduces boiler plate code because there is no need to do null checks and exception
catching each time a null value is acceptable.

Spring LDAP for example defines the entry class attributes as strings and treats null value as non existing attribute. These utilities can be useful when using that library.