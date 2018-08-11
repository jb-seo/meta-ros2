# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represent the kinematic and dynamic parameters of a robot    mechanism. <tt>kdl_parser</tt> provides tools to construct a KDL    tree from an XML robot representation in URDF."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros orocos-kdl libtinyxml tinyxml-vendor urdf urdfdom-headers"
SRC_URI = "https://github.com/ros2-gbp/kdl_parser-release/archive/release/bouncy/kdl_parser/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7debb050459ae71277df4f4e3db5a4ea"
SRC_URI[sha256sum] = "2043e302901811b08192ec4c2d21073b38959dd43b989d94db4b071ca5ce8235"
S = "${WORKDIR}/kdl_parser-release-release-bouncy-kdl_parser-2.1.0-0"

inherit catkin
