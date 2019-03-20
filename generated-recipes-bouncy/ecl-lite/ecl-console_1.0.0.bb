# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Color codes for ansii consoles."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_console"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-license \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    ecl-build \
    ecl-config \
    ecl-license \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_console/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cfaf24ffafa1d3c39952dcf0d9a2e5b1"
SRC_URI[sha256sum] = "63e11aa8a8898082f2fc06c14e264620760014e7d5da08926fcb90f465d14716"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_console-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-lite/ecl-lite_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-lite/ecl-lite_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/ecl-lite-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

