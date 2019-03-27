# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that the msgs available through this plugin is the ones that are stored   on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/rqt_msg"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-catkin-pkg-modules \
    python-qt-binding \
    rclpy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rqt_msg-release/archive/release/crystal/rqt_msg/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "14b7b4e0c13f255e3f971e84ca11702d"
SRC_URI[sha256sum] = "60afac52d8e0054ba07516357ddf272edea74802ee7b779ed0c89a9d39cd88fd"
S = "${WORKDIR}/rqt_msg-release-release-crystal-rqt_msg-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-msg/rqt-msg_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-msg/rqt-msg_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-msg/rqt-msg-${PV}_common.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

