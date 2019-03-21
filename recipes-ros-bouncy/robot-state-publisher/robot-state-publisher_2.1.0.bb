# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 version of the robot_state_publisher package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "geometry-msgs kdl-parser orocos-kdl rclcpp sensor-msgs tf2-ros urdf urdfdom-headers"
SRC_URI = "https://github.com/ros2-gbp/robot_state_publisher-release/archive/release/bouncy/robot_state_publisher/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c9b66479b86db5532a6befa25e50b04"
SRC_URI[sha256sum] = "3a62500553657d5020fa09e661322a7611d5173665942d3b4e9ac53e60ea63c5"
S = "${WORKDIR}/robot_state_publisher-release-release-bouncy-robot_state_publisher-2.1.0-0"

inherit ros
inherit ament


