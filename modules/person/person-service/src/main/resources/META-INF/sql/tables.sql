create table FOO_Person (
	uuid_ VARCHAR(75) null,
	personId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	personName VARCHAR(75) null,
	personSurname VARCHAR(75) null,
	personBirthdate DATE null,
	personEmail VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);