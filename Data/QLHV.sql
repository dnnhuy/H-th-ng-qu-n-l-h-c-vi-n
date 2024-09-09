CREATE DATABASE QLHV

go
USE QLHV

go
-- 1. Tao bang Coso
CREATE TABLE Coso
(
	MaCS		nvarchar (10) constraint PK_Coso_MaCS primary key,
	TenCS		nvarchar (50) not null,
	Diachi		nvarchar (100) not null
)
go

--Them du lieu vao bang Coso
INSERT INTO Coso
VALUES 
		('HNTH', N'Hà Nội Trung Hòa', N'Tòa nhà Thanh Chân, Nguyễn Thị Thập HN'),
		('HNTP', N'Hà Nội Trần Phú', N'20 Trần Phú, Hà Đông HN'),
		('HNLB', N'Hà Nội Long Biên', N'4 Nguyễn Văn Cừ, Long Biên HN'),
		('HCMGV', N'HCM Gò Vấp', N'366 Phan Văn Trị, Gò Vấp HCM'),
		('HCM2', N'HCM Quận 2', N'Tòa HaLand Thảo Điền, Q2 HCM'),
		('HCMBT', N'HCM Bình Thạnh', N'Tòa ParkView Điện Biên Phủ, Bình Thạnh HCM')

go

go
-- 2. Tao bang LoaiHinh
CREATE TABLE LoaiHinh
(
	MaLoai		nvarchar (10) constraint PK_LoaiHinh_MaLoai primary key,
	TenLoai		nvarchar (50) not null,
)
go

--Them du lieu vao bang LoaiHinh
INSERT INTO LoaiHinh
VALUES 
		('TTU', N'Trực tuyến'),
		('TTI', N'Trực tiếp'),
		('HR', N'Trực tiếp và Trực tuyến kết hợp')


go
-- 3. Tao bang MonHoc
CREATE TABLE MonHoc
(
	MaMH		nvarchar (10) constraint PK_MonHoc_MaMH primary key,
	TenMH		nvarchar (50) not null,
	Congcu		nvarchar (20) 
)
go

--Them du lieu vao bang MonHoc
INSERT INTO MonHoc
VALUES 
		('AM', N'3D Art & Multimedia', N'Microbit'),
		('PA', N'Programming & Application', N'Bootstrap'),
		('RE', N'Robotics & Engineering', N'Arduino'),
		('SC', N'Summer Camp', N'' )

go

-- 4. Tao bang HocVien
CREATE TABLE HocVien
(
  MaHV			nvarchar (10) constraint PK_HocVien_MaHV primary key, 
  HoTenHV		nvarchar (50)  not null,
  NgaySinhHV	datetime not null, 
  GioiTinhHV	nvarchar (5) not null constraint CK_HocVien_GioiTinhHV Check (GioiTinhHV in ('Nam', N'Nữ', N'Khác')),

)
go

--Them du lieu vao bang HocVien
INSERT INTO HocVien
VALUES 
		('HV01', N'Nguyễn Xuân Hùng', convert(datetime, '10-9-2017'), 'Nam'),
		('HV02', N'Nguyễn Hoàng Dũng', convert(datetime, '7-9-2012'), 'Nam'),
		('HV03', N'Nguyễn Quốc Việt', convert(datetime, '7-7-2010'), 'Nam'),
		('HV04', N'Nguyễn Mai Hồng', convert(datetime, '11-9-2010'), N'Nữ'),
		('HV05', N'Nguyễn Hà Anh', convert(datetime, '12-9-2010'), N'Nữ'),
		('HV06', N'Trần Nhật Nhi', convert(datetime, '6-9-2011'), N'Nữ'),
		('HV07', N'Trần Quốc An', convert(datetime, '8-9-2013'), 'Nam'),
		('HV08', N'Đỗ Nhật Hà', convert(datetime, '1-8-2008'), N'Nữ'),
		('HV09', N'Trần Thiên Ân', convert(datetime, '5-1-2009'), N'Nữ'),
		('HV010', N'Lê Thảo Nhi', convert(datetime, '2-2-2008'), N'Nữ'),
		('HV011', N'Nguyễn Hà Dịu Thảo', convert(datetime, '10-2-2016'), N'Nữ'),
		('HV012', N'Ngô Quỳnh Mai', convert(datetime, '3-5-2014'), N'Nữ'),
		('HV013', N'Bùi Quỳnh Hoa', convert(datetime, '9-2-2008'), N'Nữ'),
		('HV014', N'Huỳnh Phạm Thủy Tiên', convert(datetime, '11-6-2010'), N'Nữ'),
		('HV015', N'Trần Bảo Ngọc', convert(datetime, '8-2-2011'), N'Nữ'),
		('HV016', N'Nguyễn Phương Nhi', convert(datetime, '1-9-2007'), N'Nữ'),
		('HV017', N'Dược Sĩ Tiến', convert(datetime, '2-1-2008'), 'Nam'),
		('HV018', N'Hoàng Song Hà', convert(datetime, '6-4-2010'), N'Nữ'),
		('HV019', N'Nguyễn Quỳnh', convert(datetime, '1-2-2013'), N'Nữ'),
		('HV020', N'Nguyễn Đan Tiên', convert(datetime, '7-2-2013'), N'Nữ')
go


-- 5. Tao bang GiaoVien
CREATE TABLE GiaoVien
(
  MaGV			nvarchar (10) constraint PK_GiaoVien_MaGV primary key, 
  HoTenGV		nvarchar (50)  not null,
  NgaySinhGV	datetime not null, 
  GioiTinhGV	nvarchar (5) not null constraint CK_GiaoVien_GioiTinhGV Check (GioiTinhGV in ('Nam', N'Nữ', N'Khác')),
  SDT			nvarchar(11) not null, 
  CCCD			nvarchar (20) not null,
)
go

--Them du lieu vao bang GiaoVien
INSERT INTO GiaoVien
VALUES 
		('GV01', N'Nguyễn Quang Khải', convert(datetime, '10-3-1997'), 'Nam', '0975007632', '735687156'),
		('GV02', N'Trần Xuân Hương', convert(datetime, '7-9-1993'), N'Nữ', '0935000433', '744687156'),
		('GV03', N'Nguyễn Quốc Đạt', convert(datetime, '7-7-1990'), 'Nam', '0985007802', '735687476'),
		('GV04', N'Lương Mai Quyên', convert(datetime, '11-9-1999'), N'Nữ', '0975017688', '975687156'),
		('GV05', N'Trần Mai Thanh', convert(datetime, '12-9-1996'), N'Nữ', '0935666602', '735777156'),
		('GV06', N'Bùi Xuân Anh', convert(datetime, '6-1-1997'), N'Nữ', '0913007677', '735699156'), 
		('GV07', N'Phạm Ngọc Anh', convert(datetime, '6-5-1994'), 'Nam', '0913447677', '735699122'),
		('GV08', N'Trần Thị La', convert(datetime, '7-7-1998'), N'Nữ', '0913447622', '735699352'),
		('GV09', N'Phạm Thị Khánh', convert(datetime, '5-1-1999'), N'Nữ', '0913444380', '735699865'),
		('GV10', N'Bùi Minh', convert(datetime, '6-1-1991'), 'Nam', '0913443579', '735699197')
go 

-- 9. Tao bang NhomKN
CREATE TABLE NhomKN
(
  MaKN		nvarchar (10) constraint PK_NhomKN_MaKN primary key, 
  TenKN		nvarchar (50)  not null,
  Mota	nvarchar (100) not null, 
  Bac	float not null, 
)
go

-- Them du lieu vao bang NhomKN
INSERT INTO NhomKN
VALUES 
		('KN01', N'Kỹ năng tích hợp', N'Communication - Critical Thinking - Creativity - Collaboration', 3),
		('KN02', N'Kỹ năng thích nghi', N'Thông qua giải quyết thách thức của những dự án mới trong quá trình học.', 5),
		('KN03', N'Tư duy thực hiện quy trình',N'Tư duy thực hiện quy trình', 2),
		('KN04', N'Communication',N'Thông qua hoạt động trình bày, truyền đạt ý tưởng dưới dạng nói và viết', 1),
		('KN05', N'Critical Thinking',N'Thông qua việc tự tin nói lên quan điểm và các lập luận cá nhân.', 2)


-- 6. Tao bang Khoahoc
go
CREATE TABLE KhoaHoc
(
  MaKH		nvarchar (10) constraint PK_Khoahoc_MaKH primary key, 
  TenKH		nvarchar (50) not null,
  Tuoi		nvarchar (5)  not null,
  Thoiluong	nvarchar (50) not null, 
  Gia		nvarchar (50) not null,
  Slmax		float		  not null,
  -- Khóa ngoại
   MaMH		nvarchar (10) ,
   FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH),
   MaLoai	nvarchar (10) ,
   FOREIGN KEY (MaLoai) REFERENCES LoaiHinh(MaLoai),
   MaKN		nvarchar (10)  ,
   FOREIGN KEY (MaKN) REFERENCES NhomKN(MaKN)
)

-- Them du lieu vao bang
go
INSERT INTO KhoaHoc
VALUES 
		('KH01', N'STEAM Art', N'7-15', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'200.000/h', N'16', N'AM',N'TTI',N'KN01' ),
		('KH02', N'Digi Style: MultiMedia', N'7-15', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'200.000/h', N'16' , N'AM',N'TTI',N'KN02' ),
		('KH03', N'Mầm non công nghệ', N'5-7', N'144 giờ (2 học kỳ ~ 24 tháng), 90p mỗi buổi', N'180.000/h', N'16' , N'PA', N'TTI', N'KN03'),
		('KH04', N'Khám phá lập trình với CodeKitten', N'7-11', N'81 buổi', N'50.000/h', N'30', N'PA', N'TTU', N'KN04' ),
		('KH05', N'Lập trình App với Swift', N'15-18', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'300.000/h', N'25', N'PA' , N'HR', N'KN01'),
		('KH06', N'Bé làm Game', N'7-11', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'200.000/h', N'16' , N'PA', N'TTI', N'KN02'),
		('KH07', N'Lập trình Web Django', N'15-18', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'300.000/h', N'25', N'PA', N'HR', N'KN01' ),
		('KH08', N'Khám phá Robotics', N'7-11', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'200.000/h', N'16', N'RE', N'TTI', N'KN05' ),
		('KH09', N'Xưởng chế tạo Robot', N'11-15', N'288 giờ (3 học kỳ ~ 36 tháng), 120p mỗi buổi', N'200.000/h', N'16', N'RE', N'HR', N'KN04' ),
		('KH10', N'Summer Camp 2024–Camp', N'7-11', N'3 tháng', N'3.000.000/thang', N'30', N'SC', N'TTI', N'KN01' )

-- 8. Tao bang PhongHoc
go
CREATE TABLE PhongHoc
(
  MaPH		nvarchar (10) constraint PK_PhongHoc_MaPH primary key, 
  Succhua	float not null,
  MaCS		nvarchar (10)  not null,
  FOREIGN KEY (MaCS) REFERENCES CoSo(MaCS)
)
-- Them du lieu vao bang
go
INSERT INTO PhongHoc
VALUES 
	('PH01','30','HNTH'),
	('PH02','25','HNTP'),
	('PH03','40','HCMGV'),
	('PH04','30','HCM2'),
	('PH05','35','HCM2'),
	('PH06','35','HCMBT'),
	('PH07','30','HCMGV'),
	('PH08','40','HNTP')

-- 7. Tao bang LopHP
go
CREATE TABLE LopHP
(
  MaLHP		nvarchar (10) constraint PK_LopHP_MaLHP primary key, 
  NgayBd		datetime not null, 
  NgayKt		datetime not null, 
  -- Khóa ngoại
   MaKH		nvarchar (10) ,
   FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH),
   MaGV	nvarchar (10) ,
   FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV),
   MaPH		nvarchar (10)  ,
   FOREIGN KEY (MaPH) REFERENCES PhongHoc(MaPH)
)
--drop table LopHP
-- Them du lieu vao bang
go
INSERT INTO LopHP
VALUES 
	('LHP01',convert(datetime, '6-3-2024'),convert(datetime, '7-3-2024'),'KH01','GV01','PH01'),
	('LHP02',convert(datetime, '6-9-2024'),convert(datetime, '7-9-2024'),'KH02','GV02','PH02'),
	('LHP03',convert(datetime, '8-3-2024'),convert(datetime, '9-3-2024'),'KH03','GV03','PH03'),
	('LHP04',convert(datetime, '6-9-2024'),convert(datetime, '7-9-2024'),'KH04','GV04','PH04'),
	('LHP05',convert(datetime, '6-3-2024'),convert(datetime, '7-3-2024'),'KH05','GV05','PH05'),
	('LHP06',convert(datetime, '8-3-2024'),convert(datetime, '9-3-2024'),'KH06','GV06','PH06'),
	('LHP07',convert(datetime, '6-3-2024'),convert(datetime, '9-3-2024'),'KH07','GV07','PH07'),
	('LHP08',convert(datetime, '6-3-2024'),convert(datetime, '9-3-2024'),'KH08','GV08','PH08'),
	('LHP09',convert(datetime, '6-3-2024'),convert(datetime, '9-3-2024'),'KH08','GV09','PH08'),
	('LHP10',convert(datetime, '6-3-2024'),convert(datetime, '9-3-2024'),'KH09','GV09','PH08'),
	('LHP11',convert(datetime, '6-3-2024'),convert(datetime, '9-3-2024'),'KH10','GV10','PH06'),
	('LHP12',convert(datetime, '6-5-2024'),convert(datetime, '9-5-2024'),'KH10','GV08','PH05')

-- 10. Tao bang DangKy
go
CREATE TABLE DangKy
(
  MaHV		nvarchar (10)not null, 
  MaLHP		nvarchar (10) not null,
  NgayDk	datetime not null, 
  Khuyenmai float ,
  Xeploai	nvarchar (5),
  Chungchi	nvarchar (20) 
  -- Khóa ngoại
   CONSTRAINT PK_DK PRIMARY KEY (MaHV,MaLHP),
   FOREIGN KEY (MaHV) REFERENCES HocVien(MaHV),
   FOREIGN KEY (MaLHP) REFERENCES LopHP(MaLHP)
)
-- Them du lieu vao bang
go
INSERT INTO DangKy
VALUES 
	('HV01','LHP01',convert(datetime, '5-3-2024'),0,'A','JD bac 1'),
	('HV02','LHP05',convert(datetime, '5-3-2024'),0,'B','JD bac 1'),
	('HV03','LHP07',convert(datetime, '6-1-2024'),0,'A','JD bac 2'),
	('HV04','LHP01',convert(datetime, '5-19-2024'),0,'A','JD bac 1'),
	('HV01','LHP04',convert(datetime, '5-3-2024'),0,'B','JD bac 1'),
	('HV05','LHP02',convert(datetime, '6-2-2024'),0,'A','JD bac 1'),
	('HV06','LHP01',convert(datetime, '5-2-2024'),0,'C','JD bac 2'),
	('HV07','LHP01',convert(datetime, '6-3-2024'),0,'A','JD bac 4'),
	('HV08','LHP01',convert(datetime, '6-3-2024'),0,'A','JD bac 2'),
	('HV09','LHP01',convert(datetime, '5-3-2024'),0,'B','JD bac 1'),
	('HV010','LHP01',convert(datetime, '6-3-2024'),0,'B','JD bac 1'),
	('HV011','LHP10',convert(datetime, '5-3-2024'),0,'C','JD bac 3'),
	('HV012','LHP11',convert(datetime, '6-3-2024'),0,'B','JD bac 2'),
	('HV013','LHP12',convert(datetime, '6-3-2024'),0,'A','JD bac 2'),
	('HV014','LHP01',convert(datetime, '5-10-2024'),0,'A','JD bac 3'),
	('HV015','LHP01',convert(datetime, '6-3-2024'),0,'B','JD bac 2'),
	('HV016','LHP03',convert(datetime, '6-3-2024'),0,'A','JD bac 2'),
	('HV017','LHP04',convert(datetime, '6-3-2024'),0,'B','JD bac 1'),
	('HV018','LHP06',convert(datetime, '5-3-2024'),0,'A','JD bac 3'),
	('HV019','LHP08',convert(datetime, '6-3-2024'),0,'C','JD bac 2'),
	('HV020','LHP09',convert(datetime, '5-13-2024'),0,'A','JD bac 5'),
	('HV010','LHP04',convert(datetime, '5-22-2024'),0,'B','JD bac 2')

	--Tạo ràng buộc
	use QLHV

create trigger bd_kt
on LopHP
for insert, update
as
If exists (select * 
		    from LopHP
			where LopHP.NgayBd>LopHP.NgayKt)
	begin
		print (N'Ngày bắt đầu đang trễ hơn ngày kết thúc, vui lòng nhập lại!')
		rollback tran
	end


create trigger tg_ngaydk
on DangKy
for insert, update
as
If exists (select * 
		    from inserted, DangKy, LopHP
			where inserted.MaLHP=DangKy.MaLHP and inserted.MaLHP=LopHP.MaLHP and inserted.NgayDK>LopHP.NgayBd)
	begin
		print (N'Ngày đăng ký đang trễ hơn ngày bắt đầu học, vui lòng nhập lại!')
		rollback tran
	end


