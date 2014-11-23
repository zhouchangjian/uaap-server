drop table if exists sys_user;
drop table if exists sys_organization;
drop table if exists sys_resource;
drop table if exists sys_role;

create table sys_user (
  id bigint generated by default as identity,
  organization_id bigint,
  username varchar(100),
  password varchar(100),
  salt varchar(100),
  role_ids varchar(100),
  locked bool default false,
  primary key (id)
) ;

create table sys_organization (
  id bigint generated by default as identity,
  name varchar(100),
  parent_id bigint,
  parent_ids varchar(100),
  available bool default false,
  primary key (id)
);


create table sys_resource (
  id bigint generated by default as identity,
  name varchar(100),
  type varchar(50),
  url varchar(200),
  parent_id bigint,
  parent_ids varchar(100),
  permission varchar(100),
  available bool default false,
  primary key (id)
);

create table sys_role (
  id bigint generated by default as identity,
  role varchar(100),
  description varchar(100),
  resource_ids varchar(100),
  available bool default false,
  primary key (id)
);
create table oauth2_client (
  id bigint generated by default as identity,
  client_name varchar(100),
  client_id varchar(100),
  client_secret varchar(100),
  primary key (id)
);