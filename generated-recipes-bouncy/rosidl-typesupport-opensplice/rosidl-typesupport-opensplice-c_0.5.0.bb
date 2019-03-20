# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for PrismTech OpenSplice."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    opensplice-cmake-module-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-typesupport-opensplice-cpp-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    rmw \
    rosidl-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/bouncy/rosidl_typesupport_opensplice_c/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dd9ace7a3a9efba6fcb4d4f5d2b8ecd2"
SRC_URI[sha256sum] = "a8e57bc2aa75bbbc98765c77fa8d0d31257973c1b237f664d7981d6741e5bde6"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-bouncy-rosidl_typesupport_opensplice_c-0.5.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosidl-typesupport-opensplice/rosidl-typesupport-opensplice_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosidl-typesupport-opensplice/rosidl-typesupport-opensplice_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-typesupport-opensplice/rosidl-typesupport-opensplice-c-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-typesupport-opensplice/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-typesupport-opensplice/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

