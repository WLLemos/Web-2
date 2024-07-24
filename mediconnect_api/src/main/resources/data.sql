SET SESSION FOREIGN_KEY_CHECKS=0;

-- Dados para a tabela Paciente
INSERT INTO Paciente (id, nome, email, telefone, dataNascimento, grupoSanguineo, sexo, cep) VALUES
(1, 'João Silva', 'joao.silva@example.com', '11987654321', '1985-05-20', 'O+', 'Masculino', '01001-000'),
(2, 'Maria Souza', 'maria.souza@example.com', '11987654322', '1990-08-15', 'A-', 'Feminino', '02002-000'),
(3, 'Carlos Lima', 'carlos.lima@example.com', '11987654323', '1982-11-30', 'B+', 'Masculino', '03003-000');

-- Dados para a tabela Medico
INSERT INTO Medico (id, nome, registroConselho, telefone, email) VALUES
(1, 'Dr. Pedro Alves', 'CRM12345', '11987654324', 'pedro.alves@example.com'),
(2, 'Dra. Ana Clara', 'CRM54321', '11987654325', 'ana.clara@example.com'),
(3, 'Dr. Lucas Martins', 'CRM67890', '11987654326', 'lucas.martins@example.com');

-- Dados para a tabela Atendimento
INSERT INTO Atendimento (id, data, hora, status, paciente_id, medico_id) VALUES
(1, '2023-07-20', '10:00:00', 'AGENDADO', 1, 1),
(2, '2023-07-21', '11:00:00', 'CONFIRMADO', 2, 2),
(3, '2023-07-22', '12:00:00', 'CANCELADO', 3, 3);

SET SESSION FOREIGN_KEY_CHECKS=1;