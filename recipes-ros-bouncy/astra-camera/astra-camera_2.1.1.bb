# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Drivers for Orbbec Astra Devices."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "builtin-interfaces rclcpp sensor-msgs boost git libudev-dev libusb-1.0-dev"
SRC_URI = "https://github.com/ros2-gbp/ros_astra_camera-release/archive/release/bouncy/astra_camera/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c3a7587850e9cfadcec3746d7addb910"
SRC_URI[sha256sum] = "21269326784bcf416424404ffbfdd1a1d6abc5eb83efdafc4fc8abaa700bebd8"
S = "${WORKDIR}/ros_astra_camera-release-release-bouncy-astra_camera-2.1.1-0"

inherit ros
inherit ament


