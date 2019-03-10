# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demonstrates ROS 2's realtime capabilities with a simulated inverted pendulum."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake pendulum-msgs rclcpp rttest tlsf-cpp"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/pendulum_control/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3556c19c9e4ae7e870ffd0c5a051512f"
SRC_URI[sha256sum] = "160c00093e5a42d1b3a66f3000c322ee41dd3c43a04103b6372c99db57475f98"
S = "${WORKDIR}/demos-release-release-crystal-pendulum_control-0.6.2-0"

inherit catkin
