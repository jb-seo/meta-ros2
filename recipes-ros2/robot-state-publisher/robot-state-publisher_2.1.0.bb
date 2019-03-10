# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 version of the robot_state_publisher package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake geometry-msgs kdl-parser orocos-kdl rclcpp sensor-msgs tf2-ros urdf urdfdom-headers"
SRC_URI = "https://github.com/ros2-gbp/robot_state_publisher-release/archive/release/crystal/robot_state_publisher/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "85d9320ca8251b76bd646912ad93024c"
SRC_URI[sha256sum] = "d849ccbb30a8a45c01a4a67ab1c7fbcfa331902a2786e127739eb63182b539a1"
S = "${WORKDIR}/robot_state_publisher-release-release-crystal-robot_state_publisher-2.1.0-0"

inherit catkin
