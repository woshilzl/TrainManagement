<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
    <title>BOSS系统</title>
    <style>
        body{
            height: 100%;
            margin: 0px;
            min-width: 1100px;
            min-height: 600px;
        }
        html{
            height: 100%;
        }
        #head{
            width: 100%;
            height: 8%;
            background-image: url("images/headerbg.gif");
            min-height: 70px;
            background-size:200px ;
        }
        #catalogue{
            width: 15%;
            height: 92%;
            float:left;
        }
        #content{
            width: 85%;
            height: 92%;
            float:right;
            /*background-color: aquamarine;*/
        }
        #head-left{
            float: left;
            text-align: center;
            /*margin-top: 10px;*/
        }
        #head-left img{
            width: 100%;
        }
        #head-right a{
            font-size: 16px;
            color: white;
            font-family: 微软雅黑;
        }
        #head-right{
            float:right;
            width: 35%;
            height: 100%;
            font-size: 16px;
            color: white;
            font-family: 微软雅黑;
            min-width: 640px;
        }
        #head-right div{
            float: left;
            height: 50%;
            text-align: center;
            margin-right: 2%;
            margin-top: 4%;
        }
        #copyright{
            position: fixed;
            bottom: 10px;
            font-size: 12px;
        }
        ul{
            list-style-image:url("images/leftmenu.gif");
        }
        #catalogue a{
            font-size: 16px;
        }
        #catalogue{
            background-image: url("images/leftbg.gif");
            background-size: 100%;
        }
        #catalogue div{
            margin-top: 8px;
            margin-bottom: 1%;
        }
        #content{
            font-size: 16px;
        }
        #content div{
            margin-bottom: 0px;
        }
        #firstline{
            background-color: #c4e0f3;
            height: 42px;
        }
        .leftelement{
            margin-left: 30px;
            float: left;
            margin-top: 10px;
        }
        .rightelement{
            margin-right: 30px;
            float: right;
            margin-top: 10px;
        }
        #secondline{
            background-color: #c4e0f3;
            height: 40px;
            font-weight: 600;
        }
        .tabs-header{
            background-color: white;
        }
        .techinterview_div{
            position: relative;
        }
        .emlployManagement_div{
            position: relative;
        }
        .toleranttable td{
            font-size: 16px;
            text-align: center;
        }
        .toleranttable{
            position: absolute;
            top:15px;
        }
        .lineone{
            background-color: rgba(153, 153, 153, 0.52);
        }
        .studentname{
            width: 10%;
        }
        .graduateschool{
            width: 25%;
        }
        .graduatetime{
            width: 15%;
        }
        .major{
            width: 20%;
        }
        .degree{
            width: 10%;
        }
        .status{
            width: 10%;
        }
    </style>
</head>
<body>
<div id="head">
    <div id="head-left">
        <img src="images/logo.png">
    </div>
    <div id="head-right">
        <div>
            <img src="images/welcome.gif">您好：Administrator admin
        </div>
        <div>
            <a href="http://www.baidu.com">英文版</a>
        </div>
        <div>
            <a href="http://www.baidu.com">中文版</a>
        </div>
        <div>
            <a href="http://www.baidu.com">个人设定</a>
        </div>
        <div>
            <a href="http://www.baidu.com">系统管理</a>
        </div>
        <div>
            <a href="http://www.baidu.com">注销</a>
        </div>
    </div>
</div>
<div id="catalogue">
    <div>
        <div><ul><li><a href="http://www.baidu.com">※基本操作※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※培训资源※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※学员管理※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※人事管理※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※就业管理※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※企业客户※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※报表中心※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※市场营销※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※财务模块※</a></li></ul></div>
        <div><ul><li><a href="http://www.baidu.com">※邮件通知发送※</a></li></ul></div>
    </div>
</div>

<div id="content">
    <div id="firstline">
        <div class="leftelement">
            就业管理
        </div>
    </div>
    <div class="easyui-tabs" style="width:100%;height:94.5%;">
        <div title="技术面试" style="padding:10px;">
            请选择：
            <select>
                <option>全部</option>
                <option>未通过</option>
                <option>通过</option>
            </select>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button>搜索</button>
            <div class="techinterview_div">
                <table class="toleranttable">
                    <tr class="lineone">
                        <td class="studentname">学员姓名</td>
                        <td class="graduateschool">毕业院校</td>
                        <td class="major">所学专业</td>
                        <td class="degree">学历</td>
                        <td class="graduatetime">毕业时间</td>
                        <td class="status">技术面试状态</td>
                    </tr>
                </table>
            </div>
        </div>
        <div title="就业管理" closable="true" style="padding:10px;">
            按条件查询：&nbsp;&nbsp;&nbsp;
            姓名:&nbsp;<input type="text" name="studentname" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            学号:&nbsp;<input type="text" name="studentnumber" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            班级:&nbsp;<input type="text" name="studentclass" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button>查询</button>
	            <div class="techinterview_div">
	                <table class="toleranttable">
	                    <tr class="lineone">
	                        <td class="studentname">学员姓名</td>
	                        <td class="graduateschool">毕业院校</td>
	                        <td class="major">所学专业</td>
	                        <td class="degree">学历</td>
	                        <td class="graduatetime">毕业时间</td>
	                        <td class="status">技术面试状态</td>
	                    </tr>
	                </table>
	            </div>
        </div>
    </div>
</div>
</body>
</html>