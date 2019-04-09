# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rcl \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rmw-implementation \
    rosgraph-msgs \
    rosidl-generator-cpp \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    rcl \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rmw \
    rmw-implementation \
    rosgraph-msgs \
    rosidl-generator-cpp \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rmw \
    rmw-implementation-cmake \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/crystal/rclcpp/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1b34a369ef49ed08533ac18917f630fa"
SRC_URI[sha256sum] = "3e44eb8a55ec050770adbf472136315a6027877cadfdf3d27ca9571a6c68ea1b"
S = "${WORKDIR}/rclcpp-release-release-crystal-rclcpp-0.6.3-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rclcpp/rclcpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rclcpp/rclcpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/rclcpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rclcpp/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
