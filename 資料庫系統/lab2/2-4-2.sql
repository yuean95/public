USE [MySchoolDB]
GO
/****** Object:  Table [dbo].[Department]    Script Date: 2023/10/5 下午 07:19:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Department](
	[Dep_code] [char](4) NOT NULL,
	[Dep_name] [nvarchar](10) NOT NULL,
	[Dep_head] [nvarchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Dep_code] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 2023/10/5 下午 07:19:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[stu_id] [char](5) NOT NULL,
	[stu_name] [nvarchar](10) NOT NULL,
	[dep_code] [char](4) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[stu_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Department] ([Dep_code], [Dep_name], [Dep_head]) VALUES (N'D001', N'資工系', N'李春雄')
INSERT [dbo].[Department] ([Dep_code], [Dep_name], [Dep_head]) VALUES (N'D002', N'資管系', N'李安')
GO
INSERT [dbo].[Student] ([stu_id], [stu_name], [dep_code]) VALUES (N'S0001', N'一心', N'D001')
INSERT [dbo].[Student] ([stu_id], [stu_name], [dep_code]) VALUES (N'S0002', N'二聖', N'D001')
INSERT [dbo].[Student] ([stu_id], [stu_name], [dep_code]) VALUES (N'S0003', N'三多', N'D002')
INSERT [dbo].[Student] ([stu_id], [stu_name], [dep_code]) VALUES (N'S0004', N'四維', N'D002')
INSERT [dbo].[Student] ([stu_id], [stu_name], [dep_code]) VALUES (N'S0005', N'五福', N'D002')
GO
