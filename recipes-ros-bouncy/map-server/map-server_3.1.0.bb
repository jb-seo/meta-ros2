# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "map_server provides the <tt>map_server</tt> ROS <a href="http://www.ros.org/wiki/Nodes">Node</a>, which offers map data as a ROS <a href="http://www.ros.org/wiki/Services">Service</a>. It also provides the <tt>map_saver</tt> command-line utility, which allows dynamically generated maps to be saved to file."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "geometry-msgs nav-msgs rclcpp rcutils tf2 sdl sdl-image yaml-cpp"
SRC_URI = "https://github.com/ros2-gbp/navigation-release/archive/release/bouncy/map_server/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "adb17c5bca1ea29d6c73784b5c7b946e"
SRC_URI[sha256sum] = "e88e2e3ca3bc362bb239a9676c6eb163f4bacde842ebdee79ee3cdb850dd8ac9"
S = "${WORKDIR}/navigation-release-release-bouncy-map_server-3.1.0-0"


inherit ros
inherit ament

