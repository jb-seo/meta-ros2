# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Custom messages for real-time pendulum control."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-generators \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
ROS_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_EXPORT_DEPENDS}"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_EXPORT_DEPENDS}"

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/pendulum_msgs/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a825265076be1d87494319f4653df8d6"
SRC_URI[sha256sum] = "f960fe64a941379222eff4d5dcd6a45f640940653938af8395d6873219bf16f0"
S = "${WORKDIR}/demos-release-release-bouncy-pendulum_msgs-0.5.1-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/demos/demos_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/demos-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

