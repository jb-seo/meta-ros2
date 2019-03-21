# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "builtin-interfaces sensor-msgs std-msgs eigen libpcl-all-dev"
SRC_URI = "https://github.com/ros2-gbp/pcl_conversions-release/archive/release/bouncy/pcl_conversions/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8331fc6c5f2f04637a4efcc90f262543"
SRC_URI[sha256sum] = "6b75fca01e3d419f039ce4a4e54c870f7274ad59f47c16715676ea067974650a"
S = "${WORKDIR}/pcl_conversions-release-release-bouncy-pcl_conversions-2.0.0-0"

inherit ros
inherit ament


