# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package to aggregate the packages required to use publish / subscribe, services, generate messages and other core ROS concepts."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-cmake-auto ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest ament-cmake-ros ament-index-cpp ament-index-python ament-lint-auto ament-lint-common class-loader common-interfaces pluginlib rcl-lifecycle rclcpp rclcpp-lifecycle rclpy ros2launch ros2lifecycle ros2msg ros2node ros2param ros2pkg ros2run ros2service ros2srv ros2topic ros-environment rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/bouncy/ros_core/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bdbebbd3dbd673603f1323c1518db4c9"
SRC_URI[sha256sum] = "f861888f8a9def642c8b8d62ec6e120b6bbd2e4106f9990c00b24fe498bbe895"
S = "${WORKDIR}/variants-release-release-bouncy-ros_core-0.5.1-0"

inherit catkin
