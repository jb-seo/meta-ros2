# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "cmake eigen pkgconfig"
SRC_URI = "https://github.com/ros2-gbp/orocos_kinematics_dynamics-release/archive/release/bouncy/orocos_kdl/3.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e28fd99376063237bf3107629da57a70"
SRC_URI[sha256sum] = "9902b1fbe014a218f8e31b389c02e70ecf74da795888d000bfcaa1e8d1755bab"
S = "${WORKDIR}/orocos_kinematics_dynamics-release-release-bouncy-orocos_kdl-3.0.1-0"

inherit ros
inherit cmake


