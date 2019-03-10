# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "cmake eigen pkgconfig"
SRC_URI = "https://github.com/ros2-gbp/orocos_kinematics_dynamics-release/archive/release/crystal/orocos_kdl/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8fcdd0c6d26d78c32312666c31893df4"
SRC_URI[sha256sum] = "2c444773f68360b316d826a5bf7c0f12e9a3989d90eb2d350e703a6226a4303e"
S = "${WORKDIR}/orocos_kinematics_dynamics-release-release-crystal-orocos_kdl-3.1.0-0"

inherit catkin
