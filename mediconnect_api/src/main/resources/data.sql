SET SESSION FOREIGN_KEY_CHECKS=0;

-- Dados para a tabela Paciente
INSERT INTO Paciente (id, cep, data_nascimento, email, grupo_sanguineo, nome, sexo, telefone) VALUES
(1, '01001-000', '1985-05-20', 'joao.silva@example.com', 'O+', 'João Silva', 'Masculino', '11987654321'),
(2, '02002-000', '1990-08-15', 'maria.souza@example.com', 'A-', 'Maria Souza', 'Feminino', '11987654322'),
(3, '03003-000', '1982-11-30', 'carlos.lima@example.com', 'B+', 'Carlos Lima', 'Masculino', '11987654323');

-- Dados para a tabela Medico
INSERT INTO Medico (id, email, nome, registro_conselho, telefone) VALUES
(1, 'pedro.alves@example.com', 'Dr. Pedro Alves', 'CRM12345', '11987654324'),
(2, 'ana.clara@example.com', 'Dra. Ana Clara', 'CRM54321', '11987654325'),
(3, 'lucas.martins@example.com', 'Dr. Lucas Martins', 'CRM67890', '11987654326');

-- Dados para a tabela Atendimento
INSERT INTO Atendimento (id, data, hora, status, paciente_id, medico_id) VALUES
(1, '2023-07-20', '10:00:00', 'AGENDADO', 1, 1),
(2, '2023-07-21', '11:00:00', 'CONFIRMADO', 2, 2),
(3, '2023-07-22', '12:00:00', 'CANCELADO', 3, 3);

SET SESSION FOREIGN_KEY_CHECKS=1;