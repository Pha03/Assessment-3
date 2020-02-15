CREATE TABLE `customer` (
  ssn VARCHAR(20),
  firstname VARCHAR(30) NOT NULL,
  lastname VARCHAR(30) NOT NULL,
  zipcode VARCHAR(30) NOT NULL
  creditcardno VARCHAR(30) NOT NULL,
  PRIMARY KEY (`ssn`)
);

INSERT INTO  customer (ssn, firstname, lastname,zipcode, creditcardno ) VALUES
  ('436-48-4293', 'Linda', 'Terry','85276', '5638749368'),
  ('234-67-9863', 'Mary', 'Johnson','56738','7537294762'),
  ('234-47-8727','Peter', 'Alakija', '46283', '1234863817'),
  ('462-46-3902', 'Susan','Jacob','53427','2534297655');


  create table 'bank'(
   ssn VARCHAR(20),
   eligibility bit,
   primary key ('ssn')
  );

  insert into banks (ssn,eligibility) values
  ('091-32-2324','Y');