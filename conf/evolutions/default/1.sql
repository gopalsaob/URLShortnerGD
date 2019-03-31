# --- !Ups

create table "UrlPath" if not exists (
  "id" bigint generated by default as identity(start with 1) not null primary key,
  "path" varchar not null,
  "parent_id" bigint
  constraint unique_path_parent_id unique(parent_id, path)
);

# --- !Downs

drop table "UrlPath" if exists;
