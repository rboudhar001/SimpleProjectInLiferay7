# SimpleProjectInLiferay7

Simple Project in Lifery 7 for show a table of persons and add new ones.

- Person-API
- Person-Service
- Person-Web

Instructions
1) Download the Project
2) Import in your Liferay IDE as Gradle Project
3) Build the Project with Gradle
4) Add in your portal-ext.properties the next properties =>

<code>
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
</code>

4) Deploy in your Liferay Server (the three modules)
5) Add the Portlet to your page
