CREATE VIEW teacher_view as
select te.*,ca.name carrera
from teacher te JOIN career ca
                  ON te.career_id = ca.id;