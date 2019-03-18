# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represent the kinematic and dynamic parameters of a robot    mechanism. <tt>kdl_parser</tt> provides tools to construct a KDL    tree from an XML robot representation in URDF."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " orocos-kdl libtinyxml tinyxml-vendor urdf urdfdom-headers"
SRC_URI = "https://github.com/ros2-gbp/kdl_parser-release/archive/release/crystal/kdl_parser/2.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ce47e4f042d4961cb018d4976d8b2c7"
SRC_URI[sha256sum] = "9f3e1d9af948522e30fceb48dc27cd55cf2726965b00b6d3f745f205e49c92bf"
S = "${WORKDIR}/kdl_parser-release-release-crystal-kdl_parser-2.2.0-0"

inherit ament
