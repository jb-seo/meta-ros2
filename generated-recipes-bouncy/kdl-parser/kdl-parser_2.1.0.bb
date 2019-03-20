# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represent the kinematic and dynamic parameters of a robot    mechanism. <tt>kdl_parser</tt> provides tools to construct a KDL    tree from an XML robot representation in URDF."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/kdl_parser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    orocos-kdl \
    libtinyxml \
    tinyxml-vendor \
    urdf \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    orocos-kdl \
    libtinyxml \
    tinyxml-vendor \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

SRC_URI = "https://github.com/ros2-gbp/kdl_parser-release/archive/release/bouncy/kdl_parser/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7debb050459ae71277df4f4e3db5a4ea"
SRC_URI[sha256sum] = "2043e302901811b08192ec4c2d21073b38959dd43b989d94db4b071ca5ce8235"
S = "${WORKDIR}/kdl_parser-release-release-bouncy-kdl_parser-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/kdl-parser/kdl-parser_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/kdl-parser/kdl-parser_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kdl-parser/kdl-parser-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

