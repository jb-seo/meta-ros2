# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "<p>             amcl is a probabilistic localization system for a robot moving in             2D. It implements the adaptive (or KLD-sampling) Monte Carlo             localization approach (as described by Dieter Fox), which uses a             particle filter to track the pose of a robot against a known map.         </p>         <p>             This node is derived, with thanks, from Andrew Howard's excellent             'amcl' Player driver.         </p>"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=58d727014cda5ed405b7fb52666a1f97"

DEPENDS = "ament-cmake-auto ament-cmake-ros geometry-msgs nav-msgs rclcpp rcutils sensor-msgs std-srvs tf2 tf2-geometry-msgs tf2-msgs tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/navigation-release/archive/release/bouncy/${PN}/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc7da83f0ff07046283a8cd18f43295a"
SRC_URI[sha256sum] = "d51f060b28a6f705570ad7c5a97944ee03365274d75d888e4e08b7f3e8959a94"
S = "${WORKDIR}/navigation-release-release-bouncy-${PN}-3.1.0-0"

inherit catkin
