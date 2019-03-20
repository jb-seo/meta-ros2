# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package to aggregate the packages required to use publish / subscribe, services, generate messages and other core ROS concepts."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    ament-cmake \
    ament-cmake-auto \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-cmake-ros \
    ament-index-cpp \
    ament-index-python \
    ament-lint-auto \
    ament-lint-common \
    class-loader \
    common-interfaces \
    pluginlib \
    rcl-lifecycle \
    rclcpp \
    rclcpp-lifecycle \
    rclpy \
    ros2launch \
    ros2lifecycle \
    ros2msg \
    ros2node \
    ros2param \
    ros2pkg \
    ros2run \
    ros2service \
    ros2srv \
    ros2topic \
    ros-environment \
    rosidl-default-generators \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/bouncy/ros_core/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bdbebbd3dbd673603f1323c1518db4c9"
SRC_URI[sha256sum] = "f861888f8a9def642c8b8d62ec6e120b6bbd2e4106f9990c00b24fe498bbe895"
S = "${WORKDIR}/variants-release-release-bouncy-ros_core-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/variants/variants_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/variants/variants_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/variants-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

