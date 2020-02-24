create index IX_EEDE5C8E on FOO_Person (personName[$COLUMN_LENGTH:75$], personSurname[$COLUMN_LENGTH:75$]);
create index IX_9B838A68 on FOO_Person (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_55BB8AEA on FOO_Person (uuid_[$COLUMN_LENGTH:75$], groupId);