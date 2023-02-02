CREATE VIEW agreement_view as
select  ag.*,c.name empresa, t.name profesor, tu.name tutor
from agreement ag JOIN tutor tu ON ag.tutor_id =tu.id
                  JOIN teacher t ON ag.teacher_id=t.id
                  JOIN company c ON c.id=ag.company_id;

CREATE VIEW specific_view as
select  sp.*,ag.id, ca.name
from specific_agreement sp JOIN agreement ag ON sp.agreement_id =ag.id
                           JOIN career ca ON sp.career_id=ca.id