# SimpleProjectInLiferay7

Simple Project in Lifery 7 for show a table of persons and add new ones.

Liferay Workspace Project
- Person-API
- Person-Service
- Person-Web

### Instructions

1) Download the Project and unzip it
2) Import in your Liferay IDE as Liferay Workspace Project
3) Click in the option "Download the Bundle" for download the Liferay server if you don't have one.
4) Add in your portal-ext.properties (It's in the server) the next properties
```html
mail.session.mail.store.protocol=imap
mail.session.mail.transport.protocol=smtp
mail.session.mail.smtp.host=smtp.gmail.com
mail.session.mail.smtp.port=465
mail.session.mail.smtp.auth=true
mail.session.mail.smtp.user=YOUR_EMAIL@gmail.com
mail.session.mail.smtp.password=YOUR PASSWORD
mail.session.mail.smtp.starttls.enable=true
mail.session.mail.smtp.socketFactory.class=javax.net.ssl.SSLSocketFactory
mail.session.mail.imap.host=localhost
mail.session.mail.pop3.host=localhost
```
6) Build the Project with Gradle
7) Deploy in your Liferay Server (the three modules)
8) Add the Portlet to your page
