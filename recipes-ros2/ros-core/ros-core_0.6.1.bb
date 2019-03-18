# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package to aggregate the packages required to use publish / subscribe, services, generate messages and other core ROS concepts."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "          class-loader common-interfaces pluginlib rcl-lifecycle rclcpp rclcpp-lifecycle rclpy ros2launch ros2lifecycle ros2msg ros2multicast ros2node ros2param ros2pkg ros2run ros2service ros2srv ros2topic ros-environment rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/crystal/ros_core/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6c00ec37c4ae8f84e62b8648274ed751"
SRC_URI[sha256sum] = "9a63fb497e726d067691d7876f32675db43300613a56920c77e1d50bd2b6ab16"
S = "${WORKDIR}/variants-release-release-crystal-ros_core-0.6.1-0"

inherit ament
