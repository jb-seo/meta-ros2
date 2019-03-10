# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal nodes which have timers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_timer/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0c139731e8c8d7e9f3bfd6a56ddc95f"
SRC_URI[sha256sum] = "c91989f73ff09b2d97c5796309871807892f5e1f0f212fabf047e6e84bab1231"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_timer-0.6.2-0"

inherit catkin
