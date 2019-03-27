# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities to interface with <a href="http://gazebosim.org">Gazebo</a> through ROS."
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
HOMEPAGE = "http://gazebosim.org/tutorials?cat=connect_ros"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    gazebo-dev \
    gazebo-msgs \
    rclcpp \
    tinyxml-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    gazebo-dev \
    gazebo-msgs \
    geometry-msgs \
    rclcpp \
    sensor-msgs \
    tinyxml-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    gazebo-dev \
    gazebo-msgs \
    rclcpp \
    tinyxml-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    sensor-msgs \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_ros/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "caf8292eac0417465f20fcf15e01208f"
SRC_URI[sha256sum] = "55c32f791adc885962ddda4e80392a0c99d1cd9b3d65e3c751b9d5c0c8f41711"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_ros-3.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/gazebo-ros-pkgs/gazebo-ros-pkgs_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/gazebo-ros-pkgs/gazebo-ros-pkgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/${BPN}-${PV}.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

