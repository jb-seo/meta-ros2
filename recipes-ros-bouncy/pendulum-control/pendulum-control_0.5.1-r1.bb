# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demonstrates ROS 2's realtime capabilities with a simulated inverted pendulum."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake pendulum-msgs rclcpp rttest tlsf-cpp"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/pendulum_control/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "abec84b1415ccb55fa0617dedbbaa7c2"
SRC_URI[sha256sum] = "0f8fbfe075fba053a51e02c3b4ac87b92dda38fab854fe77e248ff57b3898616"
S = "${WORKDIR}/demos-release-release-bouncy-pendulum_control-0.5.1-1"

inherit catkin
